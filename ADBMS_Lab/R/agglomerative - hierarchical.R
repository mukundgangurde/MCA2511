df <- USArrests
View(df)  #Opens the dataset in a spreadsheet-style viewer
df <- na.omit(df)
df
d <- scale(df)
head(d) #Shows first few standardized rows

#Step : COmpute the Distance Matrix


dist_matrix <- dist(d, method = "euclidean")

hc <- hclust(dist_matrix, method = "complete")
plot(hc,
     main = "Hierarical Clustering - USArrests",
     xlab ="",
     sub = "")
plot(hc,
     cex = 0.6,
     hang = -1,
     main = "Dendrogram with Compact Labels")

hcd <- as.dendrogram(hc)
plot(hcd,
     type = "triangle",
     main = "Triangular Dendrogram - USArrests")

groups <- cutree(hc, k=4)
df$cluster <- groups
head(df)
plot(hc, cex = 0.6, hang = -1)
rect.hclust(hc, k = 4, border = "red")

#Cut the tree at height 75
cut_tree <- cut(hcd, h = 75)

#View Structure
str(cut_tree)

#Plot the top part (high-level cluster structure)
plot(cut_tree$upper, main = "Upper Dendrogram (Top Cluster Structure)")

#Plot one of teh resulting clusters (say, 2nd)
plot(cut_tree$lower[[2]], main="Detailed View of Cluster 2")

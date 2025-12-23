#Load dnecessary libraries
library(ggplot2)
library(dplyr)

mydata <- select(iris,c(1,2,3,4))
model <- kmeans(mydata, 3)
model

#Display number of items in each cluster
model$Size

#Compare actual species with cluster assignments
table(model$cluster, iris$Species)

#Convert cluster numbers to factor for plotting
iris$cluster <- as.factor(model$cluster)

#Visualize clusters by Petal dimensions
ggplot(iris, aes(Petal.Length, Petal.Width, color = cluster)) +
  geom_point(size = 3) + 
  labs(title = "K-Means Clustering of Iris Dataset",
       x = "Petal Length",
       y = "Petal Width")


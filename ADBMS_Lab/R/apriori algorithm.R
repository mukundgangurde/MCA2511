#Install and  load required packages
install.packages("arules")
install.packages("arulesViz")

library(arules)
library(arulesViz)

getwd()
setwd("A:/MCA2511/ADBMS_Lab/R")

#Read CSV file
#Make sure data_apriori.csv saved in Working Directory
mba_data <- read.csv("data_apriori.csv", stringsAsFactors = FALSE)


#Check the structure
str(mba_data)
View(mba_data)

#Ensure correct column names(case-sensitive)
colnames(mba_data) <- c("Customer_id","Products")

#Split 'Products' into individual items
trans_list <- strsplit(mba_data$Products, ",")  #Split by comma
trans_list <- lapply(trans_list, trimws) #Remove leading/trailing spaces

#Assign customer IDs as transactional names
names(trans_list) <- mba_data$Customer_id

#Convert list to 'transactions' object
trans <- as(trans_list,"transactions")

#Inspect the transactions
inspect(head(trans,5))
itemLabels(trans)
summary(trans)

#Plot items frequencies
itemFrequencyPlot(trans, topN=10,type="absolute",main="Top 10 most frequent Iemset")

#Generate Apriori rules
rules <- apriori(
  trans,
  parameter = list(support = 0.05, confidence = 0.3, minlen = 2, maxlen = 3)
)

#Check rule Summary
summary(rules)

#Inspect top rules by lift
inspect(head(sort(rules, by = "lift"),10))

# Visualize rules (interactive graph)
plot(rules,method = "graph", engine = "htmlwidget")

#Optional: Export rules to CSV
rules_df <- as(rules,"data.frame")
write.csv(rules_df,"apriori_rules_output.csv", row.names = FALSE)

#Print final confirmation
cat("Apriori analysis completed Rules saved to 'apriori rules output.csv'\n")


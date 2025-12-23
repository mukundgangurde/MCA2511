#Install and  load required packages
install.packages("arules")
install.packages("arulesViz")

library(arules)
library(arulesViz)

data("Groceries")
inspect(head(Groceries,3))
View(Groceries)
rules <- apriori(Groceries,parameter = 
                   list(support=0.01, confidence=0.09,maxlen=3,minlen=2))
rules

inspect(rules)

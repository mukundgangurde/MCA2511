#Install and load required packages
install.packages("rpart")
install.packages("rpart.plot")
library(rpart)
library(rpart.plot)

#Create a sample dataset
data <- data.frame(
  Outlook = c("Sunny","Sunny","Overcast","Rain","Rain","Rain","Overcast",
              "Sunny","Sunny","Rain","Sunny","Overcast","Overcast","Rain"),
  Temperature = c("Hot","Hot","Hot","Mild","Cool","Cool","Cool",
                  "Mild","Cool","Mild","Mild","Mild","Hot","Mild"),
  Humidity = c("High","High","High","High","Normal","Normal","Normal",
               "High","Normal","Normal","Normal","High","Normal","High"),
  Wind = c("Weak","Strong","Weak","Weak","Weak","Strong","Strong",
           "Weak","Weak","Weak","Strong","Strong","Weak","Strong"),
  PlayTennis = c("No","No","Yes","Yes","Yes","No","Yes",
                 "No","Yes","Yes","Yes","Yes","Yes","No")
)

#Build ID3 Decision Tree
model <- rpart(PlayTennis ~ Outlook + Temperature + Humidity + Wind,
               data = data,
               method = "class",
               parms = list(split = "information")) #ID3 uses information gain

#Display model Summary
print(model)

#Plot decision tree
rpart.plot(model, type = 3, extra = 102, fallen.leaves = TRUE)

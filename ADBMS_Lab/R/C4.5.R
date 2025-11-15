#Install and load required packages
install.packages("RWeka")
library(RWeka)

#Step 1: Create a sample dataset
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

#Step 2: Convert all String columns to factors
data[] <- lapply(data, as.factor)

#Step 3: Train c4.5 model(j48)
model <- J48(PlayTennis ~ Outlook + Temperature + Humidity + Wind, data = data)

#Step 4: View model Summary
summary(model)
install.packages("partykit")
library(partykit)
plot(as.party(model))

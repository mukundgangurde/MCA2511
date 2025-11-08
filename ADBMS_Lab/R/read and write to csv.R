setwd("A:/MCA2511/ADBMS_Lab/R")
getwd()

#Reading from .csv
cpInfo <- read.csv("data.csv")

#Writing data to csv
write.csv(cpInfo,"mukundcsv.csv")

#reading the new file back
newInfo <- read.csv("mukundcsv.csv")

#checking the new file
head(newInfo)

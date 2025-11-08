install.packages("XLConnect")
library(XLConnect)
install.packages("readxl")
install.packages("writexl")
library(writexl)

dataT <- read.table("data.csv",sep=",",header=T)
dataT

class(dataT)
head(dataT)
dim(dataT)
tail(dataT)
tail(dataT,2)

z <- data.frame(a=5,b=10,c=pi)
write.csv(z, file="datanew.csv",)

dataR <-read.table("datanew.csv",)
dataR 

View(dataR)
View(dataT)
#Import & Export to csv
#-using libraries in R
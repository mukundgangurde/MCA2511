my_data <- mtcars
head(mtcars, 5)

my_data <- my_data[1:6.1:5]
install.packages("dplyr")
require(dplyr)
my_data <- rename(my_data,horse_power=hp)
my_data$new_hp <- my_data$horse_power*05
colnames(my_data)
my_data
V <- c(1,2,NA,3)
V[complete.cases(V)]
naVals <- is.na(V)
install.packages("Hmisc")
library(Hmisc)
x = c(1,2,3,NA,4,4,NA)
v <-impute(x, fun=mean)
v
v<-impute(x,fun=median)
v

data1<-data.frame(Srno = c(1,2,3,NA,4,4,NA),
                  Name = c("a","b","c","d","e","f","g"),
                  Salary = c(400,200,NA,500,NA,800,900)
                  )

v <-impute(data1$rno, fun=mean)
v
v <- impute(data1$Salary, fun=median)
v
c1 <-c("low","medium","high","low")
c1 <-factor(c1,levels=c("low","medium","high"))
c1

data1<-read.csv("missing_col.csv",sep=",",
                col.names=c("Srno","Name","Salary","DOJ","Department"))
View(data1)

x <- c(1,2,3,NA,4,NA,5)
x

#Indicates which elements are missing
xn <-is.na(x)
x[!xn]
NA+4

#This will keep NA rows in data while removes them during calculate
median(x,na.rm=T)

#Return a logical vector indicating 
complete.cases(x)
is.na(data1)
datacompletecases <- data1[complete.cases(data1),]
datacompletecases

#Detect if there are any NAs: any(is.na(datan))
#Identify positions of NAs; which(is.na(data$v1))
any(is.na(x))
which(is.na(data1$Srno))
na.omit(x)


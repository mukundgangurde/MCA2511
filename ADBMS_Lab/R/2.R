myString <- "Hello World"
print(myString)
myString

#setwd() - sets current working directory
setwd("A:/MCA2511/ADBMS_Lab/R")
#getwd() - gets current working directory
getwd()


#is function
x=3
class(x)
is.character(x)
is.integer(x)
is.numeric(x)
is.double(x)
typeof(x)


y<-'2.14'
y
as.integer(y)
as.double(y)
as.character(y)


x<- c(56,51,544,412)
cat('\n','Vector using c Function', '\n',x)
length(x)
typeof(x)
class(x)

y<-seq(1,10,length.out = 6)
cat('\n', 'Vector using seq function','\n',y)
length(y)
typeof(y)

z<-2:8
cat('\n','Vector using range','\n',z)

y<-c('shubham','ganesh','kartik')
length(y)

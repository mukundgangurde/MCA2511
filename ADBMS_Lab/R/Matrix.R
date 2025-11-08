m <- matrix(c(11,12,13,55,60, 65, 66,72,78), nrow=3, ncol=3)
m

dim(m)

#By default elements in matrix are filled by column
#"byrow" attributes of matrix can be used.
m <- matrix(c(11,12,13,55,60, 65, 66,72,78), nrow=3, ncol=3, byrow=TRUE)
m

#By default elements in matrix are filled by column
#"byrow" attributes of matrix can be used.
m <- matrix(c(11,12,13,55,60, 65, 66,72,78), nrow=3, ncol=3, byrow=TRUE)
m

#cbind-ing and rbind-ing
#By using cbind() and rbind() functions
x<-c(1,2,3)
y<-c(11,12,13)
z<-cbind(x,y)
z
z<-rbind(x,y)
z

#Matrix operation/Scalar
#Addition, Subtraction an Multiplication of two matrices
#Transpose, determinant of a matrices,etc

#Multiplication by scalar
p <- 3*m
p

n <- matrix(c(4,5,6,14,15,16,24,25,26), nrow = 3, ncol=3)
#Addition of two matrices
q <- m+n
q

o<-matrix(c(4,5,6,14,15,16,24,25,26),nrow=3,ncol=3)
o

#Matrix multiplication by using %*%
r <- m%*%o
r

#Transpose of Matrix
mdash <-t(m)
mdash



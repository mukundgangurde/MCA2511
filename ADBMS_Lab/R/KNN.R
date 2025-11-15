install.packages("class")
library(class)

table(iris$Species)
str(iris$Species)
head(iris)
ir = iris
train = ir[1:100,]
irl = ir[sample(nrow(ir)),]
head(irl)
normalize <- function(x) {
  return((x-min(x)/(max(x)-min(x))))
}
iris_n <- as.data.frame(lapply(irl[,c(1,2,3,4)],normalize))
str(iris_n)
iris_train <- iris_n[1:129,]
iris_test <- iris_n[130:150,]
iris_train_target <- iris[1:129,5]
iris_test_target <- iris[130:150,5]
iris_train_target
dim(iris_train)
dim(iris_test)
model <- knn(iris_train, iris_test, cl=iris_train_target, k=13)
model
table(iris_test_target,model)
#Classification Algorithms
#Naive Bayes, KNN
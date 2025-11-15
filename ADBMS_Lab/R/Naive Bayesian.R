install.packages("e1071")
install.packages("caTools")
install.packages("caret")

library(e1071)
library(caTools)
library(caret)
View(iris)
ir <- iris
train = ir[1:100,]
train
test = ir[101:150,]
test
model = naiveBayes(Species~.,data=train)
model
test$Species
model
test$Species
train$Species
pred=predict(model,test)
table(pred)
table(test$Species)
table(train$Species)

#shuffle iris file
irl = ir[sample(nrow(ir)),]
View(irl)
train = irl[1:100,]
test = irl[101:150,]
model = model = naiveBayes(Species~.,data = train)
pred = predict (model, test)
table(pred)
table(train$Species)
table(test$Species)

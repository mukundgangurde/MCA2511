x <- c(3,8,9,13,3,6,11,21,2,16)

#response variable
y <-c(30,57,64,72,36,43,59,90,20,83)
plot(x,y)

plot(x,y,col="red",main="scatter plot")

model = lm(y~x)
model
attributes(model)
coef(model)
residuals(model)
summary(model)
abline(model)

#predicting values manually y = a + bx
x10 <- model$coefficients[[1]]+model$coefficients[[2]]*10
x10

#using predict()
a <- data.frame(x=10)
a

pred <- predict(model,a)
pred
plot(model)


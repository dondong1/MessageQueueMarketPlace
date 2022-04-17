# 1. MarketStore.java:

A farmer and customer problem also known as the bounded-buffer problem is another classical example of a multithread synchronization problem. The problem describes two threads, the farmer and the customer who share a common, fixed size invetory buffer. The farmer job is to generate a piece of data and put it into the buffer. The customer is consuming the data from the same buffer simultaneously. The problem is to make sure that the farmer will not try to add data into the buffer if it is full and that the customer will not try to remove data from an empty buffer.

# The problem is written as:

Write a simulation program for the fruit market. The farmer will be able to produce different types of fruits (apple, orange, grape, and watermelon), and put them in the market to sell. The market has limited capacity and farmers have to stand in a queue if the capacity is exceeded to sell their fruits. Consumers can come to the market any time and purchase their desired fruits; and if the fruits they want to buy runs out, they are willing to wait until the supply of that kind is ready. (Hint: implementing this market will encounter the producer and consumer problem, and it probably needs multiple buffers for different kinds of fruits)

#Sample The buffer list of the messge or fruit
private List<String> buffer = new ArrayList<String>();

# 2. Prime.java and PrimeTest.java

Implement a class that checks whether a given number is a prime using both the Thread class and Runnable interface

# 3. Notifer.java

This is a simple Timer that can periodically print a timeout message.

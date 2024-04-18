// 1. Create a Dart function named primeGenerator that generates prime numbers indefinitely using a sync generator.
// 2. Implement an async generator function called fetchData that simulates fetching data asynchronously.
// It takes a list of URLs as input and yields the contents of each URL after a simulated delay of 1 second. Use asynchronous functions for simulating the delay and fetching data.
//Test your function by printing the contents of each URL fetched.
// 3. Create a Dart program that generates a stream of integers from 1 to 10 using a StreamController.
//Then, transform this stream to double each value and print the result. Ensure that the transformation is performed asynchronously.
// 4. Write a Dart program that demonstrates proper subscription management for a stream.
//Generate a stream of random numbers every second and subscribe to it. After 10 seconds, cancel the subscription.

void main(List<String> args) {
  Iterable<int> p = primeGenerator(2);
  p.first;
}

Iterable<int> primeGenerator(int num) sync* {
  print('Prime generator started');
  bool flag = true;
  for (int i = 2; i < num; i++) {
    if (num % i == 0) {
      flag = false;
      break;
    }
  }
}
## Overview
The goal of this program is to identify and group words that are anagrams from a given input file.

## Approach
Each word is read line by line and converted into a key representing its sorted letters.  
Words sharing the same key are grouped together in a HashMap where:
- **Key:** sorted version of the word  
- **Value:** list of all words that match this sorted pattern  

Example:  
`race`, `care`, `acre` → key: `"acer"`

## Why
- Sorting letters provides a clear, deterministic key for comparison.  
- HashMap ensures O(1) average insertion and lookup time.  

## Scalability
### For 10 million words:
- Use Java Streams to process data lazily.
- Consider using a parallel stream for multi-core processing.

### For 100 billion words:
- Distribute processing across multiple nodes using Apache Spark.

## Maintainability
- Code is organized into separate classes: `Main`, `AnagramService`, `Sorter`, and `Printer`.
- Each class has a single responsibility, making the project easy to extend.

## Possible Improvements
- Add unit tests;
- Support for reading from stdin or remote URLs.
- Optional sorting of groups alphabetically for consistent output.

## Author
Nicolai Galuzin

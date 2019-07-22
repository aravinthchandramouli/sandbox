/**
 * FooBar.js
 * Replaces multiple spaces with one single space
 */

/**
 * Get this from CLI arg if present
 * or use default string
 */
let inputString = process.argv[2] || 'hello  world     test';

let modifiedString = inputString.split(' ').filter((item) => {
  return !item ? undefined : item
}).join(' ')
console.log(modifiedString);
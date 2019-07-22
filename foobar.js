/**
 * FooBar.js
 * Replaces multiple spaces with one single space
 */

/**
 * Get this from CLI arg if present
 * or use default string
 */
let inputString = process.argv[2] || 'hello  world     test';

/**
 * Log the modified string.
 * Uses RegEx
 */
console.log(inputString.replace(/\s\s+/g, ' '));
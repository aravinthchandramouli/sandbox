/**
 * Function will remove spaces which are more than one.
 * example:str="converts   all multiple   spaces! "
 * split()-Splits the string into array of words. ->["converts", "", "", "all", "multiple", "", "", "spaces!", ""]
 * filter(Boolean)-Returns an array which contains only the true values. ->["converts", "all", "multiple", "spaces!"]
 * join()-Join the array of words using single space. ->"converts all multiplpe spaces!"
 * 
 */

function str(mystr){
    
 return mystr.split(' ').filter(Boolean).join(' ')
}
console.log(str("  hello   world  ! ."))
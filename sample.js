function str(mystr){
 return mystr.split(' ').filter(Boolean).join(' ')
}

console.log(str("  hello   world  ! ."))
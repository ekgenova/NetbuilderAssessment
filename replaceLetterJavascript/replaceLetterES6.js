function replaceLetterWithPosition(text){
  return text.toLowerCase().split('')
          .filter( c => c >= 'a' & c <= 'z' )
          .map( c => c.charCodeAt(0) - 'a'.charCodeAt(0) + 1)
          .join(' ');
}

let string = "This NETbuilder assessment is way too easy.";
console.log(replaceLetterWithPosition(string));

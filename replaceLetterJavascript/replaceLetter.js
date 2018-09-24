function replaceLetterWithPosition(text){
  let result = [];
  let alphabet = "abcdefghijklmnopqrstuvwxyz";
  text = text.replace(/[^a-zA-Z]/, '').toLowerCase().split('');
  for (let i = 0; i < text.length; i++){
    let index = alphabet.indexOf(text[i]) + 1;
    if (index > 0){
      result.push(index);
    }
  }
  result = result.join(' ');
  return result;
}

let string = "This NETbuilder assessment is way too easy.";
console.log(replaceLetterWithPosition(string));

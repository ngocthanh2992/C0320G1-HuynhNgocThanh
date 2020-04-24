let regexp = /^[A-Z]/;
function isFirstLetterUpperCase(str) {
    if (regexp.test(str)) {
        alert("String's first character is upper case");
    } else {
        alert("String's first character is not upper case");
    }
}
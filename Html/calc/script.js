document.addEventListener("DOMContentLoaded", function () {
    const resultInput = document.getElementById("result");

    function appendTo(value) {
        if (resultInput.value === "0" && value !== "+" && value !== "-" && value !== "*" && value !== "/" && value !== "(" && value !== ")") {
            resultInput.value = value;
        } else {
            resultInput.value += value;
        }
    }
    function calculate(){

    }
    function clear(){
        resultInput.value=0;
    }   
    const buttons = document.querySelectorAll(".box button");
    buttons.forEach(function (button) {
        button.addEventListener("click", function () {
            const buttonText = button.textContent;
            if (buttonText) {
                if (buttonText === "=") {
                    calculate();
                } else if (buttonText === "C") {
                    clear();
                } else {
                    appendTo(buttonText);
                }
            }
        });
    });
});

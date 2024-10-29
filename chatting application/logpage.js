document.getElementById('logpage').addEventListener('submit',function(event){
    event.preventDefault();
    const username = document.getElementById('Username').value;
    const password = document.getElementById('password').value;
    const errorText = document.getElementById('errorText');
    if (username === 'swetha' && password === '123') {
        window.location.href = 'registeration.html';
    } else if (username === 'bhargi' && password === '456') {
        window.location.href = 'registeration.html';
    } else {
        errorText.textContent = 'Invalid username or password';
    }
});
document.getElementById("logoutButton").addEventListener("click", function() {
    sessionStorage.clear();
    window.location.href = "";
});









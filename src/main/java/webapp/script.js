function convertCurrency() {
    const amount = document.getElementById('amount').value;
    const fromTo = document.getElementById('fromTo').value;

    fetch('MainServlet', {
        method: 'POST',
        headers: { 'Content-Type': 'application/x-www-form-urlencoded' },
        body: `amount=${amount}&fromTo=${fromTo}`
    })
    .then(response => response.text())
    .then(data => {
        document.getElementById('result').innerText = data;
    })
    .catch(error => {
        document.getElementById('result').innerText = 'Error: ' + error;
    });
}

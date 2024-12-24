<!DOCTYPE html>
<html lang="en">
<head>
    <meta charset="UTF-8">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <title>Currency Converter</title>
    <link rel="stylesheet" href="styles.css">
</head>
<body>
    <h1>Currency Converter</h1>
    <form id="converterForm">
        <label for="amount">Amount:</label>
        <input type="number" id="amount" name="amount" required>
        <label for="fromTo">Currency Pair:</label>
        <select id="fromTo" name="fromTo">
            <option value="USD_TO_INR">USD to INR</option>
            <option value="EUR_TO_INR">EUR to INR</option>
            <option value="GBP_TO_INR">GBP to INR</option>
        </select>
        <button type="button" onclick="convertCurrency()">Convert</button>
    </form>
    <p id="result"></p>
    <script src="script.js"></script>
</body>
</html>

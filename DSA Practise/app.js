function generateCertificate() {
    var date = document.getElementById('date').value;
    var money = document.getElementById('money').value;
    var name = document.getElementById('name').value;
    var months = document.getElementById('months').value;
    var nextPaymentDate = document.getElementById('nextPaymentDate').value;

    document.getElementById('certificateDate').innerText = "Date: " + date;
    document.getElementById('certificateName').innerText = "Received with thanks from Mr./Miss " + name;
    document.getElementById('certificateMoney').innerText = money;
    document.getElementById('certificateMonths').innerText = months;
    document.getElementById('certificateNextPaymentDate').innerText = nextPaymentDate;

    document.getElementById('certificate').style.display = "block";
}

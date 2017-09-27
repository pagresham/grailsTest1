<html>
<head>
    <title>Add User Loan</title>
    <meta charset="UTF-8">
    <meta name="layout" content="user">
</head>
<body>
<div>

    <div class="userInputForm">
        <h2><b>Add new Loan for ${user.fname} ${user.lname}</b></h2>
        <g:form action="add_user_loan" controller="user">
            <p>
                <label for="lenderName">Lender Name:</label>
                <input id="lenderName" class="form-control defInputs" type="text" name="lenderName">
            </p>
            <p>
                <label for="loanType">Loan Type:</label>
                <select  id="loanType" class="form-control defInputs" name="loanType">
                    <option value="">Select One</option>
                    <option value="Federal">Federal</option>
                    <option value="Private">Private</option>
                    <option value="Personal">Personal</option>
                </select>
            </p>
            <p>
                <label for="loanNumber">Loan Number</label>

                <g:field type="text" id="loanNumber" class="form-control defInputs" name="loanNumber" />
            </p>
            <p>
                <label for="balance">Starting Balance</label>
                <g:field id="balance" class="form-control defInputs" type="number" name="balance" />
            </p>
            <input type="hidden" name="id" value="${user.id}" />

            <div class="addUser">
                <g:actionSubmit class="btn btn-info" value="Create Loan" action="add_user_loan" />
            </div>
        </g:form>
        <div>
            <p class="errorText">${params.error_message}</p>
        </div>
    </div>

</div>

</body>
</html>
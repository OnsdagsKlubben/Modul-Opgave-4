/**
 * @author Frederik Lundbeck Jørgensen
 */

if (document.readyState == 'loading') {
    document.addEventListener('DOMContentLoaded', ready);
}
else {
    ready();
}


var cartItemsUL = document.getElementById('cart-overview-list');
var addItemBtns = document.getElementsByClassName('btn btn-outline-secondary');
var cartQuantityPill = document.getElementsByClassName('badge badge-secondary badge-pill')[0];
var cartItemRows = document.getElementsByClassName('list-group-item d-flex justify-content-between lh-condensed');

function ready() {
    findAndSetAllItemCardBtns();
    findAndSetAllCartRemoveBtns();
    var checkoutBtn = document.getElementById('checkout-btn');
    checkoutBtn.addEventListener('click', checkoutBtnClicked);
}

function findAndSetAllItemCardBtns() {
    for (var i = 0; i < addItemBtns.length; i++) {
        var button = addItemBtns[i];
        button.addEventListener('click', addCartItem);
    }
}

function findAndSetAllCartRemoveBtns() {
    var sideCartRemoveBtns = document.getElementsByClassName('btn btn-light btn-sm');

    for (var i = 0; i < sideCartRemoveBtns.length; i++) {
        var button = sideCartRemoveBtns[i];
        button.addEventListener('click', removeCartItem);
    }
}

function addCartItem(event) {
    var button = event.target;

    //Get menuItem variables
    var menuItem = button.parentElement.parentElement.parentElement;
    var title = menuItem.getElementsByClassName('card-title')[0].innerText;
    var description = menuItem.getElementsByClassName('card-text')[0].innerText;
    var price = menuItem.getElementsByClassName('card-subtitle mb-2 text-muted')[0].innerText.replace(/\D/g, '');

    var itemAlreadyExistsFlag = menuItemExists(title);
    if (itemAlreadyExistsFlag != -1) {
        var row = cartItemRows[itemAlreadyExistsFlag];
        var itemQuantity = parseInt(row.getElementsByClassName('text-muted')[1].textContent);
        row.getElementsByClassName('text-muted')[1].textContent = itemQuantity + 1;

        //increment pill
        cartQuantityPill.textContent = parseInt(cartQuantityPill.textContent) + 1;
        addToTotal(parseInt(price));

        return;
    }

    //Add menuItem to cart
    var menuItemRow = document.createElement('li');
    menuItemRow.classList.add('list-group-item', 'd-flex', 'justify-content-between', 'lh-condensed');
    var menuItemRowContents =
        `<div class="item-description">
            <h6 class="my-0">${title}</h6>
            <div class="smallLineHeight">
                <small class="text-muted">${description}</small>
            </div>
            <a class="cart-item-hidden-price" hidden="">${price}</a>
        </div>
        <span class="text-muted">1</span>
        <a class="btn btn-light btn-sm"><i class="fas fa-times"></i></a>`

    menuItemRow.innerHTML = menuItemRowContents;
    var cartItems = document.getElementById('cart-items');
    cartItems.appendChild(menuItemRow);

    //increment pill
    cartQuantityPill.textContent = parseInt(cartQuantityPill.textContent) + 1;

    //Add price to total
    addToTotal(parseInt(price));

    findAndSetAllCartRemoveBtns();
}

function removeCartItem(event) {
    var buttonClicked = event.target;
    var itemQuantity = parseInt(buttonClicked.parentElement.getElementsByClassName('text-muted')[1].textContent);
    var itemPrice = parseInt(buttonClicked.parentElement.getElementsByClassName('cart-item-hidden-price')[0].textContent);

    subtractFromTotal(itemPrice * itemQuantity);
    buttonClicked.parentElement.remove();
    cartQuantityPill.textContent = parseInt(cartQuantityPill.textContent) - itemQuantity;
}


function menuItemExists(title) {
    for (var i = 0; i < cartItemRows.length; i++) {
        var rowItemTitle = cartItemRows[i].getElementsByClassName('my-0')[0].innerText;
        if (title === rowItemTitle) {
            return i;
        }
    }
    return -1;
}


function addToTotal(num) {
    var totalText = document.getElementById('total');
    var totalValue = parseInt(totalText.textContent);

    totalText.textContent = totalValue + num;
}

function subtractFromTotal(num) {
    var totalText = document.getElementById('total');
    var totalValue = parseInt(totalText.textContent);

    totalText.textContent = totalValue - num;
}

function isCartEmpty() {
    var cartItemLength = cartItemRows.length;
    if (cartItemLength > 0) {
        return false;
    }
    return true;
}

function checkoutBtnClicked() {
    if (isCartEmpty()) {
        alert('Empty cart!');
    }
    else {
        location.href = "https://www.w3schools.com";
    }

}

function populateMenuItemContainer() {
    var menuItems = /*[[${menuItems}]]*/ "";
    console.log(menuItems);
}

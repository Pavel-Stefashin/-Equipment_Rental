<!DOCTYPE HTML>
<html>
<head>
<title>Pasha the BEST!!!</title>
</head>
<body>
<h1>Аренда техники</h1><hr>
<h4>Каталог</h4>
<#list products as product>
    <div>
        <p><b>${product.title}</b> ${product.marketPrice} руб. | <a href="/product/${product.id}">Подробнее...</a></p>
    </div>
</#list>
<hr>
<h3>Создать новое объявление</h3>
<form action="product/create" method="post">
    категория: <input type="text" name="category"/><dr><dr>
    линейка товаров: <input type="text" name="paroductionRuler"/><dr><dr>
    название: <input type="text" name="title"/><dr><dr>
    серийный номер: <input type="text" name="serialNumber"/><dr><dr>
    описание: <input type="text" name="description"/><dr><dr>
    рыночная цена: <input type="number" name="marketPrice"/><dr><dr>
    закупоная цена: <input type="number" name="purchasePrice"/><dr><dr>
    комментарий: <input type="text" name="comment"/><dr><dr>
    <input type="submit" value="Создать">
</form>
</body>
</html>
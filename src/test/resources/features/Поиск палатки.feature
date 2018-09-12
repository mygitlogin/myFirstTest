#language:ru

Функционал: Поиск товаров на сайте sportmaster

  @SportMaster
  Сценарий: Запись в файл магазинов с самой дешевой  2-3-местной палаткой

    Пусть совершен переход на страницу "Стартовая страница" по ссылке из property файла "SMPage"

    И выполнено ожидание в течение 2 секунд
    Тогда значение элемента "Город" равно "Москва"
#    И выполнено нажатие на кнопку "Да"
    Тогда выполнено нажатие на кнопку "Каталог товаров"
    И выполнено нажатие на элемент с текстом "Туризм и активный отдых"
    И выполнено нажатие на элемент с текстом "Палатки и тенты"
    Тогда страница "Палатки" загрузилась
    И выполнено нажатие на кнопку "Палатки"
    И выполнено нажатие на кнопку "Фильтр"
    И выполнено нажатие на поле "Сортировка по цене"
    И выполнено нажатие на кнопку "Туристические"
    И выполнено нажатие на кнопку "Количество мест 2"
    И выполнено нажатие на кнопку "Количество мест 3"
    И выполнено нажатие на кнопку "Высокая водонепроницаемость"
    И выполнено нажатие на кнопку "Высокая ветроустойчивость"
    Тогда выполнен переход на страницу "Найденная палатка" после нажатия на кнопку "Самая дешевая палатка"
    И выполнено нажатие на кнопку "Наличие в магазинах"
    И выполнено ожидание в течение 2 секунд
    И выполнено нажатие на кнопку "Только с товаром в наличии"
    И магазины записаны в файл




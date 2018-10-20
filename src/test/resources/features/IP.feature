##language:ru
#
#Функционал: Логин в приложение
#
#  Сценарий: отправка заявки в бэк для ИП
#
#    Пусть совершен переход на страницу "Страница входа" по ссылке "https://testjmb.alfabank.ru/ona/auth/login"
#    Тогда страница "Страница входа" загрузилась
#    Когда пользователь "OpenAccount_ONF" ввел логин и пароль
#    И выполнено ожидание в течение 5 секунд
#    Тогда страница "Страница списка заявок" загрузилась
#    И элемент "Заголовок с именем пользователя" отображается на странице
#    Тогда выполнено нажатие на кнопку "Добавить новую"
#    И страница "Компания" загрузилась
#    И элемент "Информация о Вашей компании" отображается на странице
##    И в поле "Поле ввода ИНН" введено 1 случайных символов на кириллице
##    И значение поля "Поле ввода ИНН" сохранено в переменную "randomIP"
##    И в поле "Поле ввода ИНН" введено значение "ИП "
##    И в элемент "Поле ввода ИНН" дописывается значение "randomIP"
##    И выполнено ожидание в течение 3 секунд
##    И выбран любой элемент в списке "Список компаний"
#    И в элемент "Поле ввода ИНН" добавить значение "ИП " и сгенерировать 1 символов
#    И выполнено ожидание в течение 3 секунд
#    И выбран любой элемент в списке "Список компаний"
#    Тогда страница "Выбранный ИП" загрузилась
#    И поле "ИНН" недоступно для редактирования
#    И поле "огрн" недоступно для редактирования
#    И поле "Руководитель" недоступно для редактирования
#    И поле "Дата регистрации" недоступно для редактирования
#    Тогда в поле "email" введено значение "test@ghjg.ru"
#    Тогда в поле "Телефон" введено значение "9111111111"
#    Тогда в поле "Город обслуживания" введено значение ""
#    Тогда в поле "Город обслуживания" введено значение "Москва"
#    Тогда выполнено нажатие на кнопку "Оформить"
#    Тогда выполнен переход на страницу "Продукты" после нажатия на кнопку "Далее"
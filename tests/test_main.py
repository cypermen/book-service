import requests

api = 'http://localhost:8081/find/book'



def test_user_empty_get():
    s = requests.Session()
    id = '7bd047cb-a57e-412c-9d83-81c50e3e3902'
    response = s.get(f'{api}/{id}')
    assert response.status_code == 200


def test_user_save_and_get():
    s = requests.Session()
    parameters = "?name=cypermen&authorId=7bd047cb-a57e-412c-9d83-81c50e3e3902"
    response = s.post(f'{api}/{parameters}')
    assert response.status_code == 200
    assert response.json().get('name') == 'cypermen'
    createdBookId = response.json().get('id')
    responseUser = s.get(f'{api}/{createdBookId}')
    assert responseUser.status_code == 200
    assert responseUser.json().get('name') == 'cypermen'

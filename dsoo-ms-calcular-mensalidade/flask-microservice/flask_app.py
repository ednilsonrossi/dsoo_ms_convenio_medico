from flask import Flask, request, make_response, jsonify
import pandas as pd
import py_eureka_client.eureka_client as eureka_client

rest_port = 8050
eureka_client.init(eureka_server="http://localhost:8761/eureka", 
                   app_name="ms-calcular",
                   instance_port=rest_port)

app = Flask(__name__)

@app.route("/calculate", methods=['GET'])
def calcular():
    return make_response(
        jsonify(
            valor=500.0
        )
    )


if __name__ == "__main__":
    app.run(host='0.0.0.0', port = rest_port)
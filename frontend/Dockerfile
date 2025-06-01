FROM ubuntu:latest
LABEL authors="paste"

ENTRYPOINT ["top", "-b"]

FROM nginx:alpine
COPY ./public /usr/share/nginx/html
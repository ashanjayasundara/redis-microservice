FROM openjdk:8-jdk-alpine
WORKDIR /usr/msc/app
COPY package*.json ./
RUN npm install && npm install typescript -g && npm install typeorm -g
COPY . .
RUN tsc
EXPOSE 5000
CMD ["node", "./dist/index.js"]
import http from './axios-common';

export function getAllDogs(){
    return http.get("/dogs");
}
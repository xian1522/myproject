import request from './request'

export function getUserList() {
  return request({ url: '/user/list', method: 'get' })
}

export function getUser(id) {
  return request({ url: `/user/${id}`, method: 'get' })
}

export function addUser(data) {
  return request({ url: '/user', method: 'post', data })
}

export function updateUser(data) {
  return request({ url: '/user', method: 'put', data })
}

export function deleteUser(id) {
  return request({ url: `/user/${id}`, method: 'delete' })
}
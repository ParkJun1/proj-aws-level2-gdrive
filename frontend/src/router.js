
import Vue from 'vue'
import Router from 'vue-router'

Vue.use(Router);



import DashboardView from "./components/DashboardView"
import DashboardViewDetail from "./components/DashboardViewDetail"
import FileManager from "./components/listers/FileCards"
import FileDetail from "./components/listers/FileDetail"

import IndexManager from "./components/listers/IndexCards"
import IndexDetail from "./components/listers/IndexDetail"

import VedioManager from "./components/listers/VedioCards"
import VedioDetail from "./components/listers/VedioDetail"



export default new Router({
    // mode: 'history',
    base: process.env.BASE_URL,
    routes: [

            {
                path: '/dashboards',
                name: 'DashboardView',
                component: DashboardView
            },
            {
                path: '/dashboards/:id',
                name: 'DashboardViewDetail',
                component: DashboardViewDetail
            },
            {
                path: '/files',
                name: 'FileManager',
                component: FileManager
            },
            {
                path: '/files/:id',
                name: 'FileDetail',
                component: FileDetail
            },

            {
                path: '/indices',
                name: 'IndexManager',
                component: IndexManager
            },
            {
                path: '/indices/:id',
                name: 'IndexDetail',
                component: IndexDetail
            },

            {
                path: '/vedios',
                name: 'VedioManager',
                component: VedioManager
            },
            {
                path: '/vedios/:id',
                name: 'VedioDetail',
                component: VedioDetail
            },




    ]
})

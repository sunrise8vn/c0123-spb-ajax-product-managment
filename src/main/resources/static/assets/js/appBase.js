class AppBase {
    static DOMAIN_SERVER = location.origin
    static API_SERVER = this.DOMAIN_SERVER + '/api'

    static API_PRODUCT = this.API_SERVER + '/products'
    static IMAGE_SCALE_W_80_h_60_Q_90 = 'c_scale,w_80,h_60,q_90'
    static DOMAIN_CLOUDINARY = 'https://res.cloudinary.com/toanphat/image/upload'
    static API_LOCATION_REGION = 'https://vapi.vnappmob.com/api/province'
}
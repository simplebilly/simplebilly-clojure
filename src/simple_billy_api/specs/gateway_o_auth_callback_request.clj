(ns simple-billy-api.specs.gateway-o-auth-callback-request
  (:require [clojure.spec.alpha :as s]
            [spec-tools.data-spec :as ds]
            )
  (:import (java.io File)))


(def gateway-o-auth-callback-request-data
  {
   (ds/req :code) string?
   (ds/req :gateway_type) string?
   (ds/req :redirect_uri) string?
   (ds/req :state) string?
   })

(def gateway-o-auth-callback-request-spec
  (ds/spec
    {:name ::gateway-o-auth-callback-request
     :spec gateway-o-auth-callback-request-data}))

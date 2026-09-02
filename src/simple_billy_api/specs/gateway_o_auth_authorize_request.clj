(ns simple-billy-api.specs.gateway-o-auth-authorize-request
  (:require [clojure.spec.alpha :as s]
            [spec-tools.data-spec :as ds]
            )
  (:import (java.io File)))


(def gateway-o-auth-authorize-request-data
  {
   (ds/req :gateway_type) string?
   (ds/req :redirect_uri) string?
   })

(def gateway-o-auth-authorize-request-spec
  (ds/spec
    {:name ::gateway-o-auth-authorize-request
     :spec gateway-o-auth-authorize-request-data}))

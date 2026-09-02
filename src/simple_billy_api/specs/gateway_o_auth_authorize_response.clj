(ns simple-billy-api.specs.gateway-o-auth-authorize-response
  (:require [clojure.spec.alpha :as s]
            [spec-tools.data-spec :as ds]
            )
  (:import (java.io File)))


(def gateway-o-auth-authorize-response-data
  {
   (ds/req :authorization_url) string?
   (ds/req :state) string?
   })

(def gateway-o-auth-authorize-response-spec
  (ds/spec
    {:name ::gateway-o-auth-authorize-response
     :spec gateway-o-auth-authorize-response-data}))

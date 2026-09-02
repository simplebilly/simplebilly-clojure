(ns simple-billy-api.specs.o-auth-authorize-response
  (:require [clojure.spec.alpha :as s]
            [spec-tools.data-spec :as ds]
            )
  (:import (java.io File)))


(def o-auth-authorize-response-data
  {
   (ds/req :authorization_url) string?
   (ds/req :state) string?
   })

(def o-auth-authorize-response-spec
  (ds/spec
    {:name ::o-auth-authorize-response
     :spec o-auth-authorize-response-data}))

(ns simple-billy-api.specs.auth-response
  (:require [clojure.spec.alpha :as s]
            [spec-tools.data-spec :as ds]
            [simple-billy-api.specs.model :refer :all]
            )
  (:import (java.io File)))


(def auth-response-data
  {
   (ds/opt :access_token) string?
   (ds/opt :message) string?
   (ds/opt :refresh_token) string?
   (ds/req :success) boolean?
   (ds/opt :user) model-spec
   })

(def auth-response-spec
  (ds/spec
    {:name ::auth-response
     :spec auth-response-data}))

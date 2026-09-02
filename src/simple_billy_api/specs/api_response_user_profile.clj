(ns simple-billy-api.specs.api-response-user-profile
  (:require [clojure.spec.alpha :as s]
            [spec-tools.data-spec :as ds]
            [simple-billy-api.specs.api-response-user-profile-data :refer :all]
            )
  (:import (java.io File)))


(def api-response-user-profile-data
  {
   (ds/opt :data) api-response-user-profile-data-spec
   (ds/opt :error) string?
   (ds/opt :message) string?
   (ds/req :success) boolean?
   })

(def api-response-user-profile-spec
  (ds/spec
    {:name ::api-response-user-profile
     :spec api-response-user-profile-data}))

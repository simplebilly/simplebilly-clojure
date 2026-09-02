(ns simple-billy-api.specs.update-profile-request
  (:require [clojure.spec.alpha :as s]
            [spec-tools.data-spec :as ds]
            )
  (:import (java.io File)))


(def update-profile-request-data
  {
   (ds/opt :avatar_url) string?
   (ds/opt :first_name) string?
   (ds/opt :last_name) string?
   (ds/opt :name) string?
   })

(def update-profile-request-spec
  (ds/spec
    {:name ::update-profile-request
     :spec update-profile-request-data}))

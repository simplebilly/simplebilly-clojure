(ns simple-billy-api.specs.accept-invite-request
  (:require [clojure.spec.alpha :as s]
            [spec-tools.data-spec :as ds]
            )
  (:import (java.io File)))


(def accept-invite-request-data
  {
   (ds/req :first_name) string?
   (ds/req :last_name) string?
   (ds/req :password) string?
   (ds/req :privacy_accepted) boolean?
   (ds/req :token) string?
   })

(def accept-invite-request-spec
  (ds/spec
    {:name ::accept-invite-request
     :spec accept-invite-request-data}))

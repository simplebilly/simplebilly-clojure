(ns simple-billy-api.specs.verify-email-request
  (:require [clojure.spec.alpha :as s]
            [spec-tools.data-spec :as ds]
            )
  (:import (java.io File)))


(def verify-email-request-data
  {
   (ds/req :token) string?
   })

(def verify-email-request-spec
  (ds/spec
    {:name ::verify-email-request
     :spec verify-email-request-data}))

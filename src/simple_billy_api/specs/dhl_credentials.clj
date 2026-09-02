(ns simple-billy-api.specs.dhl-credentials
  (:require [clojure.spec.alpha :as s]
            [spec-tools.data-spec :as ds]
            )
  (:import (java.io File)))


(def dhl-credentials-data
  {
   (ds/req :api_key) string?
   (ds/opt :client_id) string?
   (ds/opt :client_secret) string?
   })

(def dhl-credentials-spec
  (ds/spec
    {:name ::dhl-credentials
     :spec dhl-credentials-data}))

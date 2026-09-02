(ns simple-billy-api.specs.totp-setup-response
  (:require [clojure.spec.alpha :as s]
            [spec-tools.data-spec :as ds]
            )
  (:import (java.io File)))


(def totp-setup-response-data
  {
   (ds/req :backup_codes) (s/coll-of string?)
   (ds/req :qr_code_url) string?
   (ds/req :secret) string?
   })

(def totp-setup-response-spec
  (ds/spec
    {:name ::totp-setup-response
     :spec totp-setup-response-data}))

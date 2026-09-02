(ns simple-billy-api.specs.participation-update
  (:require [clojure.spec.alpha :as s]
            [spec-tools.data-spec :as ds]
            )
  (:import (java.io File)))


(def participation-update-data
  {
   (ds/opt :acquiredAt) inst?
   (ds/opt :boardAppointment) boolean?
   (ds/opt :companyName) string?
   (ds/opt :controlAgreement) boolean?
   (ds/opt :legalForm) string?
   (ds/opt :ownershipPct) string?
   (ds/opt :purposeVehicle) boolean?
   (ds/opt :votingMajority) boolean?
   })

(def participation-update-spec
  (ds/spec
    {:name ::participation-update
     :spec participation-update-data}))

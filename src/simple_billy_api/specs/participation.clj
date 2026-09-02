(ns simple-billy-api.specs.participation
  (:require [clojure.spec.alpha :as s]
            [spec-tools.data-spec :as ds]
            )
  (:import (java.io File)))


(def participation-data
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

(def participation-spec
  (ds/spec
    {:name ::participation
     :spec participation-data}))
